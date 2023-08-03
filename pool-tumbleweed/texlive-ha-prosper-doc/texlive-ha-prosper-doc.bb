SUMMARY = "Documentation for texlive-ha-prosper"
DESCRIPTION = "This package includes the documentation for texlive-ha-prosper"
LICENSE = "LPPL-1.0"

PV = "2023.209.4.21svn59651"

RPM_NAME = "texlive-ha-prosper-doc-2023.209.4.21svn59651-54.1.noarch.rpm"
RPM_HASH = "1dd720e51c53b8fbee48e32a6b134c41cf69dd0ecc75ed204f7d8f21eef96ebeae4da952db0404a041926cf71979a0667ebfd77689c009522716dd028243d718"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "texlive-ha-prosper-doc"

RDEPENDS:${PN} += ""

inherit rpm
