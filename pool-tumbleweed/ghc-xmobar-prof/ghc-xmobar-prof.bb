SUMMARY = "Haskell xmobar profiling library"
DESCRIPTION = "This package provides the Haskell xmobar profiling library."
LICENSE = "BSD-3-Clause"

PV = "0.46"

RPM_NAME = "ghc-xmobar-prof-0.46-2.11.aarch64.rpm"
RPM_HASH = "32f85c1311e2c4dd00920bc8c2526e0325edc6811bb1f6b2ac9d5bceb8a805e3dec80229a1593789e9c74ec98b59fa48b121aef50f1c8cb9d2c7b5e9d721954c"

RPROVIDES:${PN} += "ghc-prof-xmobar-0.46-4qcZh4L72C9IX6e6EucVCt \
ghc-xmobar-prof"

RDEPENDS:${PN} += "ghc-prof-X11-1.10.3-1a2wZgfFAzXBkfyYtNRHp4 \
ghc-prof-X11-xft-0.3.4-7SpxQIcr2IsKaDkpOrx1dS \
ghc-prof-aeson-2.1.2.1-F1kFu5nx3L2A2kaYbyielc \
ghc-prof-alsa-core-0.5.0.1-5CJfdeELTf160s2ftizQdy \
ghc-prof-alsa-mixer-0.3.0-7vTOWVmX7tmF7GIGTcxaSH \
ghc-prof-async-2.2.4-LcXCzTmy8C6G7Wa774EctI \
ghc-prof-base-4.17.2.0 \
ghc-prof-bytestring-0.11.5.1 \
ghc-prof-cairo-0.13.10.0-B3UP0Vi5jIV99bUcWUsXgu \
ghc-prof-cereal-0.5.8.3-BmWUcZuhGTnIupxReuIO3I \
ghc-prof-colour-2.3.6-GBcey48GJNAK3398XtiZDq \
ghc-prof-containers-0.6.7 \
ghc-prof-dbus-1.2.29-AAIySIFW0zz7mxLdRwt0V6 \
ghc-prof-directory-1.3.7.1 \
ghc-prof-extensible-exceptions-0.1.1.4-1hcTiYLx0LbAr3mhUvVP0e \
ghc-prof-filepath-1.4.2.2 \
ghc-prof-hinotify-0.4.1-JFQ6DOM0mgyCikOfj8YmfP \
ghc-prof-http-client-tls-0.3.6.1-FlsMdDWaVoFLIhxPfXPqPa \
ghc-prof-http-conduit-2.3.8.2-JL53aegdUXo82DAJNh0Sqj \
ghc-prof-http-types-0.12.3-FlcnRjG0fwC5p06cSFRT1p \
ghc-prof-libmpd-0.10.0.0-9S81DJckoXS7PbMAbxHjm1 \
ghc-prof-mtl-2.2.2 \
ghc-prof-netlink-1.1.1.0-AkYwYtaCv1eG7Xks1z5IhU \
ghc-prof-old-locale-1.0.0.7-GoDuSK2NybfD0MMe75QkJk \
ghc-prof-pango-0.13.10.0-FM47W5PFqW5BGqK9yscE4O \
ghc-prof-parsec-3.1.16.1 \
ghc-prof-parsec-numbers-0.1.0-JmfSOl7TbABbRzQTrD74l \
ghc-prof-process-1.6.17.0 \
ghc-prof-regex-compat-0.95.2.1-L593ugdrX2dLr3iiylKH00 \
ghc-prof-stm-2.5.1.0 \
ghc-prof-time-1.12.2 \
ghc-prof-timezone-olson-0.2.1-50v8kH1zEHRIPtzATb6bsi \
ghc-prof-timezone-series-0.1.13-IHWQx2h4brT4vl06IuBnhA \
ghc-prof-transformers-0.5.6.2 \
ghc-prof-unix-2.7.3 \
ghc-prof-utf8-string-1.0.2-26mnfHz4IgtDU2rLQciXDs \
ghc-xmobar-devel"

inherit rpm
