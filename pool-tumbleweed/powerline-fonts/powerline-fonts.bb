SUMMARY = "Powerline Fonts"
DESCRIPTION = "This package provides the powerline fonts."
LICENSE = "MIT"

PV = "2.8.3"

RPM_NAME = "powerline-fonts-2.8.3-3.1.noarch.rpm"
RPM_HASH = "8d208b2cb2251b06f70ef1bb244845585bbbc0e41068a5567a104a763235eca2a624d5a9c94536dc12e382488d6af01e9b6ec334477ec9fb114e2e4eaf0ade6d"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "font-powerlinesymbols \
powerline-fonts"

RDEPENDS:${PN} += "fontconfig"

inherit rpm
