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

RPM_NAME = "perl-PerlIO-via-Timeout-0.32-1.24.noarch.rpm"
RPM_HASH = "da213e120cbd253da0c015c06ebdc99e68fb05e168ab508d7c9dde88d26f853a309cef4ab200d38c29f3339f2afe3c6940ba75e91107a97b35a4973aaf0f86db"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "perl-PerlIO--via--Timeout \
perl-PerlIO-via-Timeout"

RDEPENDS:${PN} += "perl--MODULE-COMPAT-5.36.0"

inherit rpm
