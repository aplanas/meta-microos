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

PV = "2023.209.svn66203"

RPM_NAME = "texlive-dvipdfmx-2023.209.svn66203-54.1.noarch.rpm"
RPM_HASH = "7198f62f7f8387f7766bfeb34a2d5f92e5f402fae0657be656b5168426456f5f072f1a414496affa78a722cf22424e61edd46df4b1a0c46cf3f7e2ce7659f37a"
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
