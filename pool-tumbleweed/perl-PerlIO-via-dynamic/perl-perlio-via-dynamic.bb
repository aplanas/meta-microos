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

RPM_NAME = "perl-PerlIO-via-dynamic-0.14-6.22.noarch.rpm"
RPM_HASH = "58f7ff3d6e77a3091a277c093f01cf4cf3f92ef6044f65d240369b509bfc6ac86d56e726de9ba7e71256e4e5e7b0cea0bee12ca975537050921aeff53a083b47"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "perl-PerlIO--via--dynamic \
perl-PerlIO-via-dynamic"

RDEPENDS:${PN} += "perl--MODULE-COMPAT-5.38.0"

inherit rpm
