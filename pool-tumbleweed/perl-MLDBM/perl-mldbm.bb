SUMMARY = "store multi-level Perl hash structure in single level tied hash"
DESCRIPTION = "This module can serve as a transparent interface to any TIEHASH package \
that is required to store arbitrary perl data, including nested references. \
Thus, this module can be used for storing references and other arbitrary \
data within DBM databases. \
 \
It works by serializing the references in the hash into a single string. In \
the underlying TIEHASH package (usually a DBM database), it is this string \
that gets stored. When the value is fetched again, the string is \
deserialized to reconstruct the data structure into memory. \
 \
For historical and practical reasons, it requires the *Data::Dumper* \
package, available at any CPAN site. *Data::Dumper* gives you really \
nice-looking dumps of your data structures, in case you wish to look at \
them on the screen, and it was the only serializing engine before version \
2.00. However, as of version 2.00, you can use any of *Data::Dumper*, \
*FreezeThaw* or *Storable* to perform the underlying serialization, as \
hinted at by the the SYNOPSIS manpage overview above. Using *Storable* is \
usually much faster than the other methods. \
 \
See the the BUGS manpage section for important limitations."
LICENSE = "Artistic-1.0 | GPL-1.0+"

PV = "2.05"

RPM_NAME = "perl-MLDBM-2.05-5.26.noarch.rpm"
RPM_HASH = "467cff34ea69bdeb7261160edab169b20532d3fb99b58f1703e9191d5abca5a44c1f3399d8d59db05e7eb6addf57ffa597eb8007574add677038aea0698c9eab"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "perl-MLDBM \
perl-MLDBM--Serializer \
perl-MLDBM--Serializer--Data--Dumper \
perl-MLDBM--Serializer--FreezeThaw \
perl-MLDBM--Serializer--Storable"

RDEPENDS:${PN} += "perl--MODULE-COMPAT-5.38.0"

inherit rpm
