SUMMARY = "Redirect connection through proxy servers"
DESCRIPTION = "ProxyChains NG is based on ProxyChains. \
 \
ProxyChains NG hooks network-related (TCP only) libc functions in dynamically \
linked programs via a preloaded DSO (dynamic shared object) and redirects the \
connections through one or more SOCKS4a/5 or HTTP proxies. \
 \
Since Proxy Chains NG relies on the dynamic linker, statically linked binaries \
are not supported. \
 \
Adjust ~/.proxychains/proxychains.conf for your Proxy and use ProxyChains NG \
with \
 \
    proxychains4 application"
LICENSE = "GPL-2.0-only"

PV = "4.16"

RPM_NAME = "proxychains-ng-4.16-1.7.aarch64.rpm"
RPM_HASH = "4f7bb6994536ff97ad8de4054ed124f24b75a10ff37bf632acbbdb4d6808abbadc758e74144d9c44d3ca7bf0785899ba1fcd4f8401d2c52940c61b7ec5c97d72"

RPROVIDES:${PN} += "config-proxychains-ng \
libproxychains4.so \
proxychains \
proxychains-ng"

RDEPENDS:${PN} += "/usr/bin/sh \
ld-linux-aarch64.so.1 \
libc.so.6"

inherit rpm
