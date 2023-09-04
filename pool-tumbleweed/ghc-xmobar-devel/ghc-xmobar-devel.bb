SUMMARY = "Haskell xmobar library development files"
DESCRIPTION = "This package provides the Haskell xmobar library development files."
LICENSE = "BSD-3-Clause"

PV = "0.46"

RPM_NAME = "ghc-xmobar-devel-0.46-2.11.aarch64.rpm"
RPM_HASH = "1e8be3ab134e4133b1add024fde8acbc1ef681931a8c67797c569fdb4e59f12c6c5cdff86217b8890c408c40a001647e9840e7230833fbf495fa36c2ae3b7c21"

RPROVIDES:${PN} += "ghc-devel-xmobar-0.46-4qcZh4L72C9IX6e6EucVCt \
ghc-xmobar-devel"

RDEPENDS:${PN} += "/usr/bin/sh \
ghc-compiler \
ghc-devel-X11-1.10.3-1a2wZgfFAzXBkfyYtNRHp4 \
ghc-devel-X11-xft-0.3.4-7SpxQIcr2IsKaDkpOrx1dS \
ghc-devel-aeson-2.1.2.1-F1kFu5nx3L2A2kaYbyielc \
ghc-devel-alsa-core-0.5.0.1-5CJfdeELTf160s2ftizQdy \
ghc-devel-alsa-mixer-0.3.0-7vTOWVmX7tmF7GIGTcxaSH \
ghc-devel-async-2.2.4-LcXCzTmy8C6G7Wa774EctI \
ghc-devel-base-4.17.2.0 \
ghc-devel-bytestring-0.11.5.1 \
ghc-devel-cairo-0.13.10.0-B3UP0Vi5jIV99bUcWUsXgu \
ghc-devel-cereal-0.5.8.3-BmWUcZuhGTnIupxReuIO3I \
ghc-devel-colour-2.3.6-GBcey48GJNAK3398XtiZDq \
ghc-devel-containers-0.6.7 \
ghc-devel-dbus-1.2.29-AAIySIFW0zz7mxLdRwt0V6 \
ghc-devel-directory-1.3.7.1 \
ghc-devel-extensible-exceptions-0.1.1.4-1hcTiYLx0LbAr3mhUvVP0e \
ghc-devel-filepath-1.4.2.2 \
ghc-devel-hinotify-0.4.1-JFQ6DOM0mgyCikOfj8YmfP \
ghc-devel-http-client-tls-0.3.6.1-FlsMdDWaVoFLIhxPfXPqPa \
ghc-devel-http-conduit-2.3.8.2-JL53aegdUXo82DAJNh0Sqj \
ghc-devel-http-types-0.12.3-FlcnRjG0fwC5p06cSFRT1p \
ghc-devel-libmpd-0.10.0.0-9S81DJckoXS7PbMAbxHjm1 \
ghc-devel-mtl-2.2.2 \
ghc-devel-netlink-1.1.1.0-AkYwYtaCv1eG7Xks1z5IhU \
ghc-devel-old-locale-1.0.0.7-GoDuSK2NybfD0MMe75QkJk \
ghc-devel-pango-0.13.10.0-FM47W5PFqW5BGqK9yscE4O \
ghc-devel-parsec-3.1.16.1 \
ghc-devel-parsec-numbers-0.1.0-JmfSOl7TbABbRzQTrD74l \
ghc-devel-process-1.6.17.0 \
ghc-devel-regex-compat-0.95.2.1-L593ugdrX2dLr3iiylKH00 \
ghc-devel-stm-2.5.1.0 \
ghc-devel-time-1.12.2 \
ghc-devel-timezone-olson-0.2.1-50v8kH1zEHRIPtzATb6bsi \
ghc-devel-timezone-series-0.1.13-IHWQx2h4brT4vl06IuBnhA \
ghc-devel-transformers-0.5.6.2 \
ghc-devel-unix-2.7.3 \
ghc-devel-utf8-string-1.0.2-26mnfHz4IgtDU2rLQciXDs \
ghc-xmobar \
libXpm-devel \
libXrandr-devel \
libXrender-devel"

inherit rpm
