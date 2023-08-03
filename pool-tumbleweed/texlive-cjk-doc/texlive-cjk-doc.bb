SUMMARY = "Documentation for texlive-cjk"
DESCRIPTION = "This package includes the documentation for texlive-cjk"
LICENSE = "GPL-2.0-or-later"

PV = "2023.209.4.8.5svn60865"

RPM_NAME = "texlive-cjk-doc-2023.209.4.8.5svn60865-54.1.noarch.rpm"
RPM_HASH = "89de73a8d756cd0ed180c2fdca3b193e1e7cabfeb66887d8e9852bdcefb2f8b0e0438514335d891fb754c5f26a28352d40aa488f5c80b601af45086eee3be158"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "texlive-cjk-doc"

RDEPENDS:${PN} += "/usr/bin/perl \
/usr/bin/sh"

inherit rpm
