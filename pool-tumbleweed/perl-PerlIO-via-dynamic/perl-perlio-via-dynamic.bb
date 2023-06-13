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

RPM_NAME = "perl-PerlIO-via-dynamic-0.14-6.20.noarch.rpm"
RPM_HASH = "68a7a4d9b2f26bd6968d3819c781fce1c366a80dc7122ffd5d5b99f2a2230128998fdb52904f84017d36dc0499aa49a05cb8021e500aa31fcd2f2338b9b98dac"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "perl(PerlIO::via::dynamic) \
perl-PerlIO-via-dynamic"

RDEPENDS:${PN} += "perl(:MODULE_COMPAT_5.36.0)"

inherit rpm
