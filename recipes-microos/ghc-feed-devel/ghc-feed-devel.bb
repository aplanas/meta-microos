SUMMARY = "Haskell feed library development files"
DESCRIPTION = "This package provides the Haskell feed library development files."
LICENSE = "BSD-3-Clause"

PV = "1.3.2.1"

RPM_NAME = "ghc-feed-devel-1.3.2.1-2.4.aarch64.rpm"
RPM_HASH = "045c605516e9a41c4f3b8aac4838f92adf90196d1a15c60178c6404c96d1b1c8003606b2bf9f5349b813b20552a9c5e8ad78292e1b9af7ba819cf2839556f745"

RPROVIDES:${PN} += "ghc-devel(feed-1.3.2.1-9QdnKoSJqFXKInoiUUJDkf) \
ghc-feed-devel \
ghc-feed-devel(aarch-64)"
RDEPENDS:${PN} += "/bin/sh \
ghc-compiler \
ghc-devel(base-4.17.1.0) \
ghc-devel(base-compat-0.12.2-L1DEOlMQJOdFOKsjHoWYov) \
ghc-devel(bytestring-0.11.4.0) \
ghc-devel(old-locale-1.0.0.7-B5o2Qz0CVVSCB1XGw7OfzR) \
ghc-devel(old-time-1.1.0.3-6MrxIvEBZcaI0p7TDiYNU1) \
ghc-devel(safe-0.3.19-3Ab0OpSRliCKMhc0t4Nhds) \
ghc-devel(text-2.0.2) \
ghc-devel(time-1.12.2) \
ghc-devel(time-locale-compat-0.1.1.5-4KOdffkWEDD5CJkcMekvXY) \
ghc-devel(utf8-string-1.0.2-3yyxPCwARUwDt9ZNWn320Q) \
ghc-devel(xml-conduit-1.9.1.2-EG4w0oWu477B6XYo8w0Zz4) \
ghc-devel(xml-types-0.3.8-7guWdy0cJxZLf8pjB1j9Fb) \
ghc-feed"

inherit rpm
