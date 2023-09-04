SUMMARY = "PerlIO layer that adds read & write timeout to a handle"
DESCRIPTION = "This package implements a PerlIO layer, that adds read / write timeout. \
This can be useful to avoid blocking while accessing a handle (file, \
socket, ...), and fail after some time. \
 \
The timeout is implemented by using '<select'> on the handle before \
reading/writing. \
 \
*WARNING* the handle won't timeout if you use 'sysread' or 'syswrite' on \
it, because these functions works at a lower level. However if you're \
trying to implement a timeout for a socket, see the IO::Socket::Timeout \
manpage that implements exactly that."
LICENSE = "Artistic-1.0 | GPL-1.0+"

PV = "0.32"

RPM_NAME = "perl-PerlIO-via-Timeout-0.32-1.26.noarch.rpm"
RPM_HASH = "57cb8f9f15b5055f6e938871faa02aa95562d91d89612b01054b72ba69920d86e9c6540741d644ed80e8c7b57bab124d97374fa71e1284b1e64f53797b54bb40"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "perl-PerlIO--via--Timeout \
perl-PerlIO-via-Timeout"

RDEPENDS:${PN} += "perl--MODULE-COMPAT-5.38.0"

inherit rpm
