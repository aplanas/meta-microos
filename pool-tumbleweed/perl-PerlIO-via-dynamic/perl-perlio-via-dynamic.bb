SUMMARY = "Dynamic Perlio Layers"
DESCRIPTION = "'PerlIO::via::dynamic' is used for creating dynamic PerlIO layers. It is \
useful when the behavior or the layer depends on variables. You should not \
use this module as via layer directly (ie :via(dynamic)). \
 \
Use the constructor to create new layers, with two arguments: translate and \
untranslate. Then use '$p-'via ($fh)> to wrap the handle. Once <$fh> is \
destroyed, the temporary namespace for the IO layer will be removed. \
 \
Note that PerlIO::via::dynamic uses the scalar fields to reference to the \
object representing the dynamic namespace."
LICENSE = "GPL-1.0+ | Artistic-1.0"

PV = "0.14"

RPM_NAME = "perl-PerlIO-via-dynamic-0.14-6.21.noarch.rpm"
RPM_HASH = "6d4f0afaa35e20ce1805f6698f95f9ea698a146e0d3b9f6d107758c4c43b34dfbfa8cfce6e652f455fceebbcc9e4fa859ce8feffff862754505637dff12b4cc1"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "perl-PerlIO--via--dynamic \
perl-PerlIO-via-dynamic"

RDEPENDS:${PN} += "perl--MODULE-COMPAT-5.36.1"

inherit rpm
