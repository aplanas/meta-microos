SUMMARY = "AR PL SungtiL GB Chinese TrueType font by Arphic Technology"
DESCRIPTION = "AR PL SungtiL GB is a high quality Chinese TrueType font (gbsn00lp.ttf) \
generously provided by Arphic Technology to the Free Software community \
under the Arphic Public License."
LICENSE = "Arphic-1999"

PV = "20001125"

RPM_NAME = "arphic-gbsn00lp-fonts-20001125-778.2.noarch.rpm"
RPM_HASH = "ee9acea4211b49af84ccbe15433e379219a0ab19942b3cc6a1d53a2000dddb217a6227c63fb490fd59c18a3cd4143f5b68b79ba8d2fe04bd00b88d180893e64d"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "arphic-gbsn00lp-fonts config(arphic-gbsn00lp-fonts) ttf-arphic-gbsn00lp"
RDEPENDS:${PN} += "/bin/sh arphic-fonts"

inherit rpm
