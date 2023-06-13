SUMMARY = "Object-oriented syntax sugar for File::Basename"
DESCRIPTION = "File::Basename::Object is an object-oriented wrapper around \
File::Basename. The goal is to allow pathnames to be presented and \
manipulated easily. \
 \
 \
 \
Authors: \
-------- \
    Tyler 'Crackerjack' MacDonald <japh@crackerjack.net>"
LICENSE = "Artistic-1.0"

PV = "0.01"

RPM_NAME = "perl-File-Basename-Object-0.01-64.29.aarch64.rpm"
RPM_HASH = "c915a88caae33e0550a0089b30077f495a7fe5a29a54ca3a363ba1eccc92259b1fdfab95960c9327d6325bb410dd87c24a6263949712b7fc4cd21bd3de6f6f2d"

RPROVIDES:${PN} += "perl(File::Basename::Object) \
perl-File-Basename-Object \
perl-File-Basename-Object(aarch-64)"

RDEPENDS:${PN} += "perl(:MODULE_COMPAT_5.36.0)"

inherit rpm
