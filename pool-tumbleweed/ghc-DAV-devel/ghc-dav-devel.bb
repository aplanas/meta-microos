SUMMARY = "Haskell DAV library development files"
DESCRIPTION = "This package provides the Haskell DAV library development files."
LICENSE = "GPL-3.0-or-later"

PV = "1.3.4"

RPM_NAME = "ghc-DAV-devel-1.3.4-4.11.aarch64.rpm"
RPM_HASH = "244d063efffabcc82f61c524c893439cde61df2a39dd16f4c63ed4560bc5756379cb826690f5ad0380bc9756a889424c3faf5d2c6ddb1596981bbff2d344c766"

RPROVIDES:${PN} += "ghc-DAV-devel \
ghc-devel-DAV-1.3.4-5VQFZglFEfH9Vezd4jSJsk"

RDEPENDS:${PN} += "/usr/bin/sh \
ghc-DAV \
ghc-compiler \
ghc-devel-base-4.17.2.0 \
ghc-devel-bytestring-0.11.5.1 \
ghc-devel-case-insensitive-1.2.1.0-1a748JZqftHHwwFVz8QP9 \
ghc-devel-containers-0.6.7 \
ghc-devel-data-default-0.7.1.1-4TeAZDN81Uu1IorgFaPMOc \
ghc-devel-exceptions-0.10.5 \
ghc-devel-http-client-0.7.14-DEHi4b5z3Pa56fFNKIs9J1 \
ghc-devel-http-client-tls-0.3.6.1-FlsMdDWaVoFLIhxPfXPqPa \
ghc-devel-http-types-0.12.3-FlcnRjG0fwC5p06cSFRT1p \
ghc-devel-lens-5.2.2-9FQiMfULngUCqLz60VkKPe \
ghc-devel-mtl-2.2.2 \
ghc-devel-transformers-0.5.6.2 \
ghc-devel-transformers-base-0.4.6-FmWhyTNhU3u3qYTd28DG44 \
ghc-devel-transformers-compat-0.7.2-2GbmZx5KxIlAJLN4VBqBUM \
ghc-devel-utf8-string-1.0.2-26mnfHz4IgtDU2rLQciXDs \
ghc-devel-xml-conduit-1.9.1.3-DDoR4rlzTH6QSHmFsTVd9 \
ghc-devel-xml-hamlet-0.5.0.2-DXz2ffvxE9vxmXJYBmXu"

inherit rpm
