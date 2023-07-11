SUMMARY = "Binary files of cjk-gs-integrate"
DESCRIPTION = "Binary files of cjk-gs-integrate"
LICENSE = "LPPL-1.0"

PV = "2023.20230311.svn37223"

RPM_NAME = "texlive-cjk-gs-integrate-bin-2023.20230311.svn37223-92.1.aarch64.rpm"
RPM_HASH = "16ff7898fe111e6e17348850da3725536be766e56d98aeb04069bd64cafd7ea9d2c2771c395ac14f36539dee9203c8c8784db66979d242bc580b2adef082197c"

RPROVIDES:${PN} += "texlive-cjk-gs-integrate-bin"

RDEPENDS:${PN} += "texlive-cjk-gs-integrate"

inherit rpm
