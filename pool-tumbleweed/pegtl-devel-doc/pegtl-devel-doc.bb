SUMMARY = "Parsing Expression Grammar (PEG) Template Library"
DESCRIPTION = "This package contains the development documentation for \
PEGTL (Parsing Expression Grammar Template Library)."
LICENSE = "MIT"

PV = "3.2.7"

RPM_NAME = "pegtl-devel-doc-3.2.7-1.3.noarch.rpm"
RPM_HASH = "909717c8137c62998ea2551d720ddfe260483e10b948a6b5ca16e2049f6e2e32b8796e7753ed72c9b4f3b6a78e35d57909a4d44dd5e7b8ab55be297b6844b07c"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "pegtl-devel-doc"

RDEPENDS:${PN} += ""

inherit rpm
