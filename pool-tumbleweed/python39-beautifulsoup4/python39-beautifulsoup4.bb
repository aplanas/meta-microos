SUMMARY = "HTML/XML Parser for Quick-Turnaround Applications Like Screen-Scraping"
DESCRIPTION = "Beautiful Soup is a Python HTML/XML parser designed for quick turnaround \
projects like screen-scraping. Three features make it powerful: \
 \
* Beautiful Soup won't choke if you give it bad markup. It yields a parse tree \
  that makes approximately as much sense as your original document. This is \
  usually good enough to collect the data you need and run away \
 \
* Beautiful Soup provides a few simple methods and Pythonic idioms for \
  navigating, searching, and modifying a parse tree: a toolkit for dissecting a \
  document and extracting what you need. You don't have to create a custom \
  parser for each application \
 \
* Beautiful Soup automatically converts incoming documents to Unicode and \
  outgoing documents to UTF-8. You don't have to think about encodings, unless \
  the document doesn't specify an encoding and Beautiful Soup can't autodetect \
  one. Then you just have to specify the original encoding \
 \
Beautiful Soup parses anything you give it, and does the tree traversal stuff \
for you. You can tell it 'Find all the links', or 'Find all the links of class \
externalLink', or 'Find all the links whose urls match 'foo.com', or 'Find the \
table heading that's got bold text, then give me that text.' \
 \
Valuable data that was once locked up in poorly-designed websites is now within \
your reach. Projects that would have taken hours take only minutes with \
Beautiful Soup."
LICENSE = "MIT"

PV = "4.12.2"

RPM_NAME = "python39-beautifulsoup4-4.12.2-1.3.noarch.rpm"
RPM_HASH = "199beb931ed77c31e28ca2540cae0e564fb490f86ee01a0c1c36e5694aac3018eb5ff8628b367f2decf189d3d6aa7232dd603c754ef5aaa0b992d36f67c291e9"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "python3.9dist-beautifulsoup4 \
python39-beautifulsoup4 \
python3dist-beautifulsoup4"

RDEPENDS:${PN} += "python-abi \
python39-soupsieve"

inherit rpm
