SUMMARY = "Binary files of adhocfilelist"
DESCRIPTION = "Binary files of adhocfilelist"
LICENSE = "LPPL-1.0"

PV = "2023.20230311.svn28038"

RPM_NAME = "texlive-adhocfilelist-bin-2023.20230311.svn28038-91.1.aarch64.rpm"
RPM_HASH = "a3dbc477c79c2f5b53c9ff2b48a53a61daa34843b8ca393d54b2f27c0a8fd3a16a89598ef7fafa568b63ae69fd6995618a6b7ee57dd0a8ae5abff9e1ff7c1b38"

RPROVIDES:${PN} += "texlive-adhocfilelist-bin \
texlive-adhocfilelist-bin(aarch-64)"

RDEPENDS:${PN} += "texlive-adhocfilelist"

inherit rpm
