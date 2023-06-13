SUMMARY = "Documentation for texlive-texdoc"
DESCRIPTION = "This package includes the documentation for texlive-texdoc"
LICENSE = "GPL-2.0-or-later"

PV = "2023.201.4.0.1svn66227"

RPM_NAME = "texlive-texdoc-doc-2023.201.4.0.1svn66227-54.1.noarch.rpm"
RPM_HASH = "2322a929af22e9929f948f05d2b053231933d107596feeb7dfca79b065d72341ac0800ce504051241b76aa6abc2bfef97f3e23653e9ab0e83509e18f1b32331a"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "man(texdoc.1) \
texlive-texdoc-doc"

RDEPENDS:${PN} += ""

inherit rpm
