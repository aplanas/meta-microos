SUMMARY = "Tools to integrate CJK fonts into Ghostscript"
DESCRIPTION = "This script searches a list of directories for CJK fonts, and \
makes them available to an installed Ghostscript. In the \
simplest case, with sufficient privileges, a run without \
arguments should result in a complete setup of Ghostscript."
LICENSE = "GPL-2.0-or-later"

PV = "2023.201.20210625.0svn59705"

RPM_NAME = "texlive-cjk-gs-integrate-2023.201.20210625.0svn59705-53.1.noarch.rpm"
RPM_HASH = "f43c7bcdc462607214d154cb6cc9820ffb546ab78b6744a93f59e2aa7aa7f89bce111abb0d71cc80ff9e7614d4d3c1ee4ef6af183e3e65487fbcfbd51d5066ee"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "tex(cjkgs-adobe.dat) \
tex(cjkgs-apple.dat) \
tex(cjkgs-arphic.dat) \
tex(cjkgs-bizud.dat) \
tex(cjkgs-cjkuni.dat) \
tex(cjkgs-dynacomware.dat) \
tex(cjkgs-fandol.dat) \
tex(cjkgs-fontworks.dat) \
tex(cjkgs-founder.dat) \
tex(cjkgs-hancom.dat) \
tex(cjkgs-haranoaji.dat) \
tex(cjkgs-heisei.dat) \
tex(cjkgs-hiragino.dat) \
tex(cjkgs-ipa.dat) \
tex(cjkgs-kozuka.dat) \
tex(cjkgs-macos-removeonly.dat) \
tex(cjkgs-microsoft.dat) \
tex(cjkgs-mogamobo.dat) \
tex(cjkgs-monotype.dat) \
tex(cjkgs-morisawa.dat) \
tex(cjkgs-nanum.dat) \
tex(cjkgs-notosans.dat) \
tex(cjkgs-notoserif.dat) \
tex(cjkgs-removeonly.dat) \
tex(cjkgs-ryokana.dat) \
tex(cjkgs-sazanami.dat) \
tex(cjkgs-sinotype.dat) \
tex(cjkgs-solaris.dat) \
tex(cjkgs-sourcehansans.dat) \
tex(cjkgs-sourcehanserif.dat) \
tex(cjkgs-toppan.dat) \
tex(cjkgs-typebank.dat) \
tex(cjkgs-ume.dat) \
tex(cjkgs-unfonts.dat) \
tex(cjkgs-wenquanyi.dat) \
tex(cjkgs-yu-osx.dat) \
tex(cjkgs-yu-win.dat) \
texlive-cjk-gs-integrate"

RDEPENDS:${PN} += "/bin/sh \
/usr/bin/perl \
coreutils \
ed \
findutils \
grep \
perl(Cwd) \
perl(Encode) \
perl(Encode::Alias) \
perl(File::Basename) \
perl(File::Path) \
perl(Getopt::Long) \
perl(feature) \
perl(strict) \
perl(utf8) \
perl(warnings) \
sed \
texlive \
texlive-cjk-gs-integrate-bin \
texlive-filesystem \
texlive-kpathsea \
texlive-kpathsea-bin \
texlive-scripts \
texlive-scripts-bin"

inherit rpm
