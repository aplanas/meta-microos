SUMMARY = "Tied hash with specific methods overriden by callbacks"
DESCRIPTION = "Tie::Hash::Method provides a way to create a tied hash with specific \
overriden behaviour without having to create a new class to do it. A tied \
hash with no methods overriden is functionally equivalent to a normal hash. \
 \
Each method in a standard tie can be overriden by providing a callback to \
the tie call. So for instance if you wanted a tied hash that changed 'foo' \
into 'bar' on store you could say: \
 \
    tie my %hash, 'Tie::Hash::Method', \
        STORE => sub { \
            (my $v=pop)=~s/foo/bar/g if defined $_[2]; \
            return $_[0]->base_hash->{$_[1]}=$v; \
        }; \
 \
The callback is called with exactly the same arguments as the tie itself, \
in particular the tied object is always passed as the first argument. \
 \
The tied object is itself an array, which contains a second hash in the \
HASH slot (index 0) which is used to perform the default operations. \
 \
The callbacks available are in a hash keyed by name in the METHOD slot of \
the array (index 1). \
 \
If your code needs to store extra data in the object it should be stored in \
the PRIVATE slot of the object (index 2). No future release of this module \
will ever use or alter anything in that slot. \
 \
The arguments passed to the tie constructor will be seperated by the case \
of their keys. The ones with all capitals will be stored in the METHOD \
hash, and the rest will be stored in the PRIVATE hash."
LICENSE = "GPL-1.0+ | Artistic-1.0"

PV = "0.02"

RPM_NAME = "perl-Tie-Hash-Method-0.02-1.20.noarch.rpm"
RPM_HASH = "542e75bca751f03faa95fc67f4bdd96da67b0ed4423348e273888943b564ef60c63e22df5b96638a1fca7b5464618fb66461af1b64f14923288538d93baa24fe"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "perl-Tie--Hash--Method \
perl-Tie-Hash-Method"

RDEPENDS:${PN} += "perl--MODULE-COMPAT-5.36.0"

inherit rpm
