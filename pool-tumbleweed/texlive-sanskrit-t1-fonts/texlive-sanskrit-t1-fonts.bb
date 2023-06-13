SUMMARY = "Severed fonts for texlive-sanskrit-t1"
DESCRIPTION = "The  separated fonts package for texlive-sanskrit-t1"
LICENSE = "LPPL-1.0"

PV = "2023.201.svn55475"

RPM_NAME = "texlive-sanskrit-t1-fonts-2023.201.svn55475-53.1.noarch.rpm"
RPM_HASH = "f2b1e65d84e5f8f8dad9d47ccca8e02ca3cbe6f823b4ef552a8a6eb607adcd7fcc3fa3bff44c10b645d7299d750c44be17e177e1951dbef9e90268e44a5b2528"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "font(wiknersanskrit) \
texlive-sanskrit-t1-fonts"

RDEPENDS:${PN} += "/bin/sh \
aaa_base \
coreutils \
fontconfig \
ghostscript-fonts-std \
perl"

inherit rpm
