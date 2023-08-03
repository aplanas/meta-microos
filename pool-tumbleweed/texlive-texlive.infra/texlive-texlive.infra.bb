SUMMARY = "Basic TeX Live infrastructure"
DESCRIPTION = "This package contains the files needed to get tlmgr running: \
perl modules, xz binaries, plus (sometimes) tar, wget, lz4, and \
various other support files. This package also represents the \
tlcritical recovery scripts. The standalone installer is close, \
but not the same; it's defined in 00texlive.installer."
LICENSE = "LPPL-1.0"

PV = "2023.209.svn66512"

RPM_NAME = "texlive-texlive.infra-2023.209.svn66512-55.1.noarch.rpm"
RPM_HASH = "e2685bc9655f5f7f0f879c27c4ea4af2d65538603f3338e1a4e625486c61ba97878bbe28d450b759d8cba75542bd08343f253d9b90f3d2c7cbcacf76adee5b7b"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "perl-TeXLive--TLConfFile \
perl-TeXLive--TLConfig \
perl-TeXLive--TLCrypto \
perl-TeXLive--TLPDB \
perl-TeXLive--TLPOBJ \
perl-TeXLive--TLPSRC \
perl-TeXLive--TLPaper \
perl-TeXLive--TLTREE \
perl-TeXLive--TLUtils \
perl-TeXLive--TLWinGoo \
perl-TeXLive--TeXCatalogue \
perl-TeXLive--TeXCatalogue--Entry \
tex-fmtutil-hdr.cnf \
tex-updmap-hdr.cfg \
texlive-texlive.infra"

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
