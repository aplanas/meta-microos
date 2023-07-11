SUMMARY = "Binary files of epstopdf"
DESCRIPTION = "Binary files of epstopdf"
LICENSE = "LPPL-1.0"

PV = "2023.20230311.svn18336"

RPM_NAME = "texlive-epstopdf-bin-2023.20230311.svn18336-92.1.aarch64.rpm"
RPM_HASH = "ab1453bc063f0da5e577d7b281e40192e207b69db90e4990b844d295b86331223dce201164d80c45a666c8fb79041f62116a7e94cb26dd0ffe34527bcded614e"

RPROVIDES:${PN} += "texlive-epstopdf-bin"

RDEPENDS:${PN} += "texlive-epstopdf"

inherit rpm
