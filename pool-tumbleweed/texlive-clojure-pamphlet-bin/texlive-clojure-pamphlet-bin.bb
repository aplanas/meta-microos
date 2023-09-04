SUMMARY = "Binary files of clojure-pamphlet"
DESCRIPTION = "Binary files of clojure-pamphlet"
LICENSE = "LPPL-1.0"

PV = "2023.20230311.svn51944"

RPM_NAME = "texlive-clojure-pamphlet-bin-2023.20230311.svn51944-93.2.aarch64.rpm"
RPM_HASH = "dee7d037e362b1a1515ae58e4af298a80ea61be4c5cea125a0608590282ba01cf62c6b297c0e79be6e3b178f3f0c80f58ca1d34fbd5dec3be4f4b37fc12a05ea"

RPROVIDES:${PN} += "texlive-clojure-pamphlet-bin"

RDEPENDS:${PN} += "texlive-clojure-pamphlet"

inherit rpm
