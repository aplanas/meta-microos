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

RPM_NAME = "perl-MLDBM-2.05-5.25.noarch.rpm"
RPM_HASH = "440d153a5a99d10670d52466d85116707a3c60ce5af95cb41d9bb5f743a72b89cec3dbf1c15a77b01d58e05c3a65408945cdd310aa88324e4424ddf53eb4e7b4"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "perl-MLDBM \
perl-MLDBM--Serializer \
perl-MLDBM--Serializer--Data--Dumper \
perl-MLDBM--Serializer--FreezeThaw \
perl-MLDBM--Serializer--Storable"

RDEPENDS:${PN} += "perl--MODULE-COMPAT-5.36.1"

inherit rpm
