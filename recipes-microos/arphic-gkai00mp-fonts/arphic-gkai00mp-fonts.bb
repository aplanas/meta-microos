SUMMARY = "AR PL KaitiM GB Chinese TrueType font by Arphic Technology"
DESCRIPTION = "AR PL KaitiM GB is a high quality Chinese TrueType font (gkai00mp.ttf) \
generously provided by Arphic Technology to the Free Software community \
under the Arphic Public License."
LICENSE = "Arphic-1999"

PV = "20001125"

RPM_NAME = "arphic-gkai00mp-fonts-20001125-778.2.noarch.rpm"
RPM_HASH = "5657c008a46cabb79e7c55cf6636cc05a525396afbc493afecd3acb4c2ab10b3ced9493de5423bea481e51280a0e24eb289891c2daa3e62ad0d2347ab00fd480"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "arphic-gkai00mp-fonts \
config(arphic-gkai00mp-fonts) \
ttf-arphic-gkai00mp"
RDEPENDS:${PN} += "/bin/sh \
arphic-fonts"

inherit rpm
