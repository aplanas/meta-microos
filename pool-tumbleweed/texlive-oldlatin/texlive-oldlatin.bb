SUMMARY = "Compute Modern-like font with long s"
DESCRIPTION = "Metafont sources modified from Computer Modern in order to \
generate 'long s' which was used in old text."
LICENSE = "LPPL-1.0"

PV = "2023.209.1.00svn17932"

RPM_NAME = "texlive-oldlatin-2023.209.1.00svn17932-55.1.noarch.rpm"
RPM_HASH = "6ddccff8cad23e3106c96510f370dbbcc254ab88fb38d7e9242ca575423bc2aaaf765827ffcfdbe25b7e8f3047e7e30c78cfe972f70bb927351071d1a86e0d06"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "tex-olb10.tfm \
tex-olbx10.tfm \
tex-olbx12.tfm \
tex-olbx5.tfm \
tex-olbx6.tfm \
tex-olbx7.tfm \
tex-olbx8.tfm \
tex-olbx9.tfm \
tex-olbxsl10.tfm \
tex-oldunh10.tfm \
tex-olff10.tfm \
tex-olfib8.tfm \
tex-olr10.tfm \
tex-olr12.tfm \
tex-olr17.tfm \
tex-olr5.tfm \
tex-olr6.tfm \
tex-olr7.tfm \
tex-olr8.tfm \
tex-olr9.tfm \
tex-olsl10.tfm \
tex-olsl12.tfm \
tex-olsl8.tfm \
tex-olsl9.tfm \
tex-olsltt10.tfm \
tex-olss10.tfm \
tex-olss12.tfm \
tex-olss17.tfm \
tex-olss8.tfm \
tex-olss9.tfm \
tex-olssbx10.tfm \
tex-olssdc10.tfm \
tex-olssi10.tfm \
tex-olssi12.tfm \
tex-olssi17.tfm \
tex-olssi8.tfm \
tex-olssi9.tfm \
tex-olssq8.tfm \
tex-olssqi8.tfm \
tex-oltt10.tfm \
tex-oltt12.tfm \
tex-oltt8.tfm \
tex-oltt9.tfm \
tex-olvtt10.tfm \
texlive-oldlatin"

RDEPENDS:${PN} += "/usr/bin/sh \
coreutils \
ed \
findutils \
grep \
sed \
texlive \
texlive-filesystem \
texlive-kpathsea \
texlive-kpathsea-bin \
texlive-scripts \
texlive-scripts-bin"

inherit rpm
