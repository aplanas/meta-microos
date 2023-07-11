SUMMARY = "Javadoc for paperclips"
DESCRIPTION = "Simple, light weight, extensible Java printing plug-in for SWT. PaperClips \
hides the complexity of laying out and rendering documents on the printer, \
helping you focus on what to print instead of how to print it. \
 \
In a nutshell, PaperClips provides an assortment of document 'building \
blocks,' which you can tweak and combine to form a custom document. The \
assembled document is then sent to PaperClips for printing. PaperClips \
includes support for printing text, images, borders, headers and footers, \
column layouts and grid layouts, to name a few. It can also be extended with \
your own printable classes. \
 \
With PaperClips you do not have to track cursors, calculate line breaking, \
fool around with font metrics, or manage system resources--it's all handled \
internally. And unlike report-generation tools, you are not constrained to a \
predefined document structure (like report bands). Every document is custom \
and the layout is up to you."
LICENSE = "EPL-1.0"

PV = "1.0.4"

RPM_NAME = "paperclips-javadoc-1.0.4-3.7.noarch.rpm"
RPM_HASH = "32ec7e985b2b4105f8ba95914da2f10d2d1302134e8993ca58718cd4e3132ee70a25f1de606d143b6274d3d66a4b5dadb5ab02b168837513e1bc9b9d8aba451f"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "paperclips-javadoc"

RDEPENDS:${PN} += ""

inherit rpm
