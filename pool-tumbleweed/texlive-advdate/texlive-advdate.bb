SUMMARY = "Print a date relative to 'today'"
DESCRIPTION = "Provides macros which can add a specified number of days to the \
current date (as specified in \\today), to save, set and restore \
the 'current date' and to print it. Intended use is, for \
example, in invoices 'payable within 14 days from today', etc. \
The package has only been tested with Czech dates."
LICENSE = "LPPL-1.0"

PV = "2023.209.svn20538"

RPM_NAME = "texlive-advdate-2023.209.svn20538-55.1.noarch.rpm"
RPM_HASH = "93a18d9bf97a7568964ec22be6be51a4117256c02190eee9a4dd72aee86b6ee6bbdab8dceb595aa0ca4524f4e139efe505d811e523b329b6f4d739e827f6948f"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "tex-advdate.sty \
texlive-advdate"

RDEPENDS:${PN} += "/usr/bin/sh \
coreutils \
ed \
findutils \
grep \
sed \
texlive \
texlive-filesystem \
texlive-kpathsea \
texlive-kpathsea-bin \
texlive-scripts \
texlive-scripts-bin"

inherit rpm
