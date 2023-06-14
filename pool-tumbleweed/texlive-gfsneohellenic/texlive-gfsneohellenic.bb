SUMMARY = "A font in the Neo-Hellenic style"
DESCRIPTION = "The NeoHellenic style evolved in academic circles in the 19th \
and 20th century; the present font follows a cut commissioned \
from Monotype in 1927. The present version was provided by the \
Greek Font Society. The font supports both Greek and Latin \
characters, and has been adjusted to work well with the \
cmbright fonts for mathematics support. LaTeX support of the \
fonts is provided, offering OT1, T1 and LGR encodings."
LICENSE = "LPPL-1.0"

PV = "2023.201.1.02svn63944"

RPM_NAME = "texlive-gfsneohellenic-2023.201.1.02svn63944-52.1.noarch.rpm"
RPM_HASH = "d46a901b89be1097fc53f36fde44e84cb08f24575146c843ce38447c1c92aa1e47bfc692edf070db06e05ea7b5bc3844ddf95cf904f9f045e85c11299e5f2aee"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "tex-gfsneohellenic.map \
tex-gfsneohellenic.sty \
tex-gfsneohellenicmath8a.tfm \
tex-gfsneohellenicmath8a.vf \
tex-gfsneohellenicmath8r.tfm \
tex-gneohellenicb6a.tfm \
tex-gneohellenicb6a.vf \
tex-gneohellenicb6r.tfm \
tex-gneohellenicbi6a.tfm \
tex-gneohellenicbi6a.vf \
tex-gneohellenicbi6r.tfm \
tex-gneohellenicbo6a.tfm \
tex-gneohellenicbo6a.vf \
tex-gneohellenicbo6r.tfm \
tex-gneohellenici6a.tfm \
tex-gneohellenici6a.vf \
tex-gneohellenici6r.tfm \
tex-gneohellenico6a.tfm \
tex-gneohellenico6a.vf \
tex-gneohellenico6r.tfm \
tex-gneohellenicrg6a.tfm \
tex-gneohellenicrg6a.vf \
tex-gneohellenicrg6r.tfm \
tex-gneohellenicsc6a.tfm \
tex-gneohellenicsc6a.vf \
tex-gneohellenicsc6r.tfm \
tex-gneohellenicsco6a.tfm \
tex-gneohellenicsco6a.vf \
tex-gneohellenicsco6r.tfm \
tex-lgrneohellenic.fd \
tex-neohellenic.enc \
tex-neohellenicb8a.tfm \
tex-neohellenicb8a.vf \
tex-neohellenicb8r.tfm \
tex-neohellenicb9a.tfm \
tex-neohellenicb9a.vf \
tex-neohellenicb9r.tfm \
tex-neohellenicbi8a.tfm \
tex-neohellenicbi8a.vf \
tex-neohellenicbi8r.tfm \
tex-neohellenicbi9a.tfm \
tex-neohellenicbi9a.vf \
tex-neohellenicbi9r.tfm \
tex-neohellenicbo8a.tfm \
tex-neohellenicbo8a.vf \
tex-neohellenicbo8r.tfm \
tex-neohellenicbo9a.tfm \
tex-neohellenicbo9a.vf \
tex-neohellenicbo9r.tfm \
tex-neohellenicdenomnums.enc \
tex-neohellenicdenomnums8a.tfm \
tex-neohellenicdenomnums8a.vf \
tex-neohellenicdenomnums8r.tfm \
tex-neohellenicec.enc \
tex-neohellenicecsc.enc \
tex-neohellenicel.enc \
tex-neohellenicelsc.enc \
tex-neohellenici8a.tfm \
tex-neohellenici8a.vf \
tex-neohellenici8r.tfm \
tex-neohellenici9a.tfm \
tex-neohellenici9a.vf \
tex-neohellenici9r.tfm \
tex-neohellenicmath.enc \
tex-neohellenicnumnums.enc \
tex-neohellenicnumnums8a.tfm \
tex-neohellenicnumnums8a.vf \
tex-neohellenicnumnums8r.tfm \
tex-neohellenico8a.tfm \
tex-neohellenico8a.vf \
tex-neohellenico8r.tfm \
tex-neohellenico9a.tfm \
tex-neohellenico9a.vf \
tex-neohellenico9r.tfm \
tex-neohellenicrg8a.tfm \
tex-neohellenicrg8a.vf \
tex-neohellenicrg8r.tfm \
tex-neohellenicrg9a.tfm \
tex-neohellenicrg9a.vf \
tex-neohellenicrg9r.tfm \
tex-neohellenicsc.enc \
tex-neohellenicsc8a.tfm \
tex-neohellenicsc8a.vf \
tex-neohellenicsc8r.tfm \
tex-neohellenicsc9a.tfm \
tex-neohellenicsc9a.vf \
tex-neohellenicsc9r.tfm \
tex-neohellenicsco8a.tfm \
tex-neohellenicsco8a.vf \
tex-neohellenicsco8r.tfm \
tex-neohellenicsco9a.tfm \
tex-neohellenicsco9a.vf \
tex-neohellenicsco9r.tfm \
tex-neohellenictabnums.enc \
tex-neohellenictabnums8a.tfm \
tex-neohellenictabnums8a.vf \
tex-neohellenictabnums8r.tfm \
tex-omlneohellenic.fd \
tex-ot1neohellenic.fd \
tex-t1neohellenic.fd \
tex-uneohellenicnums.fd \
texlive-gfsneohellenic"

RDEPENDS:${PN} += "/bin/sh \
coreutils \
ed \
findutils \
grep \
sed \
tex-cmbrmi10.tfm \
tex-updmap.cfg \
texlive \
texlive-filesystem \
texlive-gfsneohellenic-fonts \
texlive-kpathsea \
texlive-kpathsea-bin \
texlive-scripts \
texlive-scripts-bin"

inherit rpm
