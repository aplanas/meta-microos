SUMMARY = "Tool to check websites and HTML documents for broken links"
DESCRIPTION = "LinkChecker checks websites and HTML documents for broken links. \
 \
Features are: \
* recursive checking \
* multithreaded \
* output in colored or normal text, HTML, SQL, CSV, XML or a sitemap graph in different formats \
* HTTP/1.1, HTTPS, FTP, mailto:, news:, nntp:, Gopher, Telnet and local file links support \
* restriction of link checking with regular expression filters for URLs \
* proxy support \
* username/password authorization for HTTP and FTP \
* robots.txt exclusion protocol support \
* i18n support \
* a command line interface \
* a (Fast)CGI web interface (requires HTTP server)"
LICENSE = "GPL-2.0-or-later"

PV = "10.1.0"

RPM_NAME = "python3-linkchecker-10.1.0-1.2.noarch.rpm"
RPM_HASH = "bfb2bfc96ce460d2dce4104aa3223699896028a45bc8734705e365ff2b79c9f70a0a5fb24e00d9983be14b87af2d78ce1fda3ca766f5bb3cdf02447d9219eac0"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "linkchecker \
python3-linkchecker \
python3.11dist-linkchecker \
python3dist-linkchecker"

RDEPENDS:${PN} += "/usr/bin/python3 \
/usr/bin/sh \
python-abi \
python3-beautifulsoup4 \
python3-dnspython \
python3-pyxdg \
python3-requests \
update-alternatives"

inherit rpm
