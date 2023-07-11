SUMMARY = "An extended version of dvipdfm"
DESCRIPTION = "Dvipdfmx (formerly dvipdfm-cjk) is a development of dvipdfm \
created to support multi-byte character encodings and large \
character sets for East Asian languages. Dvipdfmx, if 'called' \
with the name dvipdfm, operates in a 'dvipdfm compatibility' \
mode, so that users of the both packages need only keep one \
executable. A secondary design goal is to support as many 'PDF' \
features as does pdfTeX. The current version of the package is \
no longer maintained on CTAN as a separate entity; development \
now takes place within the TeX Live framework, and it is no \
longer available as a separate package. For download, support, \
and other information, please see TeX Live. However, the \
information on this page is maintained and should be current."
LICENSE = "GPL-2.0-or-later"

PV = "2023.201.svn66203"

RPM_NAME = "texlive-dvipdfmx-2023.201.svn66203-53.2.noarch.rpm"
RPM_HASH = "41961c54b4d57282cf74c3b455b0af0ec1d8686fc5d1b134f523f16fe434f04c0054a0e71fbbd971a16336ee7048d264aa121ceb4473006e799fe771a74ec3f8"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "config-texlive-dvipdfmx \
tex-cid-x.map \
tex-ckx.map \
tex-dvipdfmx-unsafe.cfg \
tex-dvipdfmx.cfg \
texlive-dvipdfm \
texlive-dvipdfmx"

RDEPENDS:${PN} += "/usr/bin/sh \
coreutils \
ed \
findutils \
ghostscript \
grep \
perl \
perl-TeXLive--TLUtils \
sed \
tex-texmf.cnf \
texlive \
texlive-dvipdfmx-bin \
texlive-filesystem \
texlive-glyphlist \
texlive-kpathsea \
texlive-kpathsea-bin \
texlive-scripts \
texlive-scripts-bin \
texlive-texlive.infra"

inherit rpm
