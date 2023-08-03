SUMMARY = "Documentation for texlive-horoscop"
DESCRIPTION = "This package includes the documentation for texlive-horoscop"
LICENSE = "SUSE-Public-Domain"

PV = "2023.209.1.01svn56021"

RPM_NAME = "texlive-horoscop-doc-2023.209.1.01svn56021-54.1.noarch.rpm"
RPM_HASH = "84cca1f9aea7e6df7775e5fd4459afbc1c0766a89c70471ed36e942f783dc5d0c54dc237fcbff85df8683d8b463aac699c31b1bf07101ed82b786609177f7b7a"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "texlive-horoscop-doc"

RDEPENDS:${PN} += ""

inherit rpm
