SUMMARY = "Binary files of clojure-pamphlet"
DESCRIPTION = "Binary files of clojure-pamphlet"
LICENSE = "LPPL-1.0"

PV = "2023.20230311.svn51944"

RPM_NAME = "texlive-clojure-pamphlet-bin-2023.20230311.svn51944-92.1.aarch64.rpm"
RPM_HASH = "d846267b4bba1c3060f08bf84ada0c7a59a37d3eb99bbb577e0401b0ab8296d92cc83131e480fe7ed7b29263a46acd8d4838062b28cec35b6f58718cc85de6d2"

RPROVIDES:${PN} += "texlive-clojure-pamphlet-bin"

RDEPENDS:${PN} += "texlive-clojure-pamphlet"

inherit rpm
