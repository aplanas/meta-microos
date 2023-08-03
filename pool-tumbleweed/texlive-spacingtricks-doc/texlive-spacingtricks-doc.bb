SUMMARY = "Documentation for texlive-spacingtricks"
DESCRIPTION = "This package includes the documentation for texlive-spacingtricks"
LICENSE = "LPPL-1.0"

PV = "2023.209.1.6svn66393"

RPM_NAME = "texlive-spacingtricks-doc-2023.209.1.6svn66393-58.1.noarch.rpm"
RPM_HASH = "1524eab0ec630dea322a2e2445c8fc9379736887590635a16a0111901130cd7bf952c54590575c0c37f179f4dd2381576d12f08c34e55e0278aa51f365a73634"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "texlive-spacingtricks-doc"

RDEPENDS:${PN} += ""

inherit rpm
