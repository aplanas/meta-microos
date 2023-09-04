SUMMARY = "Binary files of pygmentex"
DESCRIPTION = "Binary files of pygmentex"
LICENSE = "LPPL-1.0"

PV = "2023.20230311.svn34996"

RPM_NAME = "texlive-pygmentex-bin-2023.20230311.svn34996-93.2.aarch64.rpm"
RPM_HASH = "e2bbc7a15bb0696c9ff59f52a20846024e30cf32fac9116a229de023178d37ee463df6dd2731d113e0662fd877c3459d03d4c5377d1dac8400edb6f5fe5e51d4"

RPROVIDES:${PN} += "texlive-pygmentex-bin"

RDEPENDS:${PN} += "texlive-pygmentex"

inherit rpm
