SUMMARY = "TeX Live infrastructure programs"
DESCRIPTION = "Includes install-tl, tl-portable, rungs, etc.; not needed for \
tlmgr to run but still ours. Not included in tlcritical."
LICENSE = "LPPL-1.0"

PV = "2023.209.svn66584"

RPM_NAME = "texlive-scripts-2023.209.svn66584-55.1.noarch.rpm"
RPM_HASH = "0eed2bd6c59899a5edb1fb411f071252482083d5d80386f2c762b9dc39987eca9ec2f3b74c04be747d867b360d7f98238377abb4be9c73cdda8718532c457722"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "config-texlive-scripts \
tex-09fbbfac.enc \
tex-0ef0afca.enc \
tex-10037936.enc \
tex-1b6d048e.enc \
tex-71414f53.enc \
tex-74afc74c.enc \
tex-aae443f0.enc \
tex-b6a4d7c7.enc \
tex-base14flags.tex \
tex-bbad153f.enc \
tex-d9b29452.enc \
tex-dvipdfm35.map \
tex-dvips35.map \
tex-f7b6d320.enc \
tex-mathpple.map \
tex-mtex.enc \
tex-pdftex35.map \
tex-ps2pk35.map \
tex-updmap.cfg \
texlive-scripts"

RDEPENDS:${PN} += "/usr/bin/perl \
/usr/bin/sh \
/usr/bin/texlua \
coreutils \
ed \
findutils \
grep \
perl-Cwd \
perl-File--Basename \
perl-File--Find \
perl-File--Spec \
perl-File--Spec--Functions \
perl-Getopt--Long \
perl-Pod--Usage \
perl-TeXLive--TLUtils \
perl-TeXLive--TLWinGoo \
perl-strict \
sed \
texlive \
texlive-filesystem \
texlive-kpathsea \
texlive-kpathsea-bin \
texlive-scripts-bin \
texlive-scripts-extra \
texlive-texlive.infra"

inherit rpm
