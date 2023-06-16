SUMMARY = "Documentation for texlive-examplep"
DESCRIPTION = "This package includes the documentation for texlive-examplep"
LICENSE = "GPL-2.0-or-later"

PV = "2023.201.0.0.04svn55265"

RPM_NAME = "texlive-examplep-doc-2023.201.0.0.04svn55265-52.1.noarch.rpm"
RPM_HASH = "62dee7a00f9d18e92a645e6c4000f92e018938960f4fd0fca93a85692bfdbc7c44d137792c05d38940a2cf34ab2b00fb50327236d72770ed7a30820f298afeb6"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "texlive-examplep-doc"

RDEPENDS:${PN} += "/usr/bin/sh"

inherit rpm
