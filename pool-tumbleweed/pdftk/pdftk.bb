SUMMARY = "A handy tool for manipulating PDF"
DESCRIPTION = "If PDF is electronic paper, then pdftk is an electronic staple-remover, \
hole-punch, binder, secret-decoder-ring, and X-Ray-glasses. \
Pdftk is a simple tool for doing everyday things with PDF documents. \
 \
Use it to: \
  * Merge PDF Documents \
  * Split PDF Pages into a New Document \
  * Rotate PDF Documents or Pages \
  * Decrypt Input as Necessary (Password Required) \
  * Encrypt Output as Desired \
  * Fill PDF Forms with X/FDF Data and/or Flatten Forms \
  * Generate FDF Data Stencil from PDF Forms \
  * Apply a Background Watermark or a Foreground Stamp \
  * Report PDF Metrics such as Metadata and Bookmarks \
  * Update PDF Metadata \
  * Attach Files to PDF Pages or the PDF Document \
  * Unpack PDF Attachments \
  * Burst a PDF Document into Single Pages \
  * Uncompress and Re-Compress Page Streams \
  * Repair Corrupted PDF (Where Possible)"
LICENSE = "GPL-2.0-or-later"

PV = "3.3.3"

RPM_NAME = "pdftk-3.3.3-1.3.noarch.rpm"
RPM_HASH = "13efea53f3db132f41b11a45de5cf5657c2ca07cd9be63d50b3595a59a26651005a004e2ecdf8ee1910e65294de8d5c6a2dbcedf030c695e327e513572a5539e"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "pdftk"

RDEPENDS:${PN} += "/usr/bin/sh \
apache-commons-lang3 \
bouncycastle \
jre"

inherit rpm
