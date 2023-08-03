SUMMARY = "Documentation for texlive-aramaic-serto"
DESCRIPTION = "This package includes the documentation for texlive-aramaic-serto"
LICENSE = "LPPL-1.0"

PV = "2023.209.1.0svn30042"

RPM_NAME = "texlive-aramaic-serto-doc-2023.209.1.0svn30042-55.1.noarch.rpm"
RPM_HASH = "0986f50b2c94ac29528851df1fd4f89286e546782105e778711124b51ce955028afe58b37ec77bdea23144da0ebe111306420b9e4c8897ae10dc39e6563630c0"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "texlive-aramaic-serto-doc"

RDEPENDS:${PN} += "/usr/bin/python3"

inherit rpm
