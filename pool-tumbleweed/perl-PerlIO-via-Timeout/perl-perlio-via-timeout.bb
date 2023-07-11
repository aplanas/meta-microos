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

RPM_NAME = "perl-PerlIO-via-Timeout-0.32-1.25.noarch.rpm"
RPM_HASH = "6b4875f00bcc090b783996027fb46f5045cb278db7bc68c04b1fd55ce2dbb5783f554eebec84f89e513adb24f485b1361b167a16442d3c142c740c71e727ce7c"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "perl-PerlIO--via--Timeout \
perl-PerlIO-via-Timeout"

RDEPENDS:${PN} += "perl--MODULE-COMPAT-5.36.1"

inherit rpm
