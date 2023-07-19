SUMMARY = "Binary files of clojure-pamphlet"
DESCRIPTION = "Binary files of clojure-pamphlet"
LICENSE = "LPPL-1.0"

PV = "2023.20230311.svn51944"

RPM_NAME = "texlive-clojure-pamphlet-bin-2023.20230311.svn51944-93.1.aarch64.rpm"
RPM_HASH = "f1db6b26ce9fcd6e24d2ea6d014efad60d8b48c00ad1dcf8e6138ad805f60da47e30543dfe40e0b18ff4f8785d362eb61edc579077ded876eb089be6e1b425aa"

RPROVIDES:${PN} += "texlive-clojure-pamphlet-bin"

RDEPENDS:${PN} += "texlive-clojure-pamphlet"

inherit rpm
