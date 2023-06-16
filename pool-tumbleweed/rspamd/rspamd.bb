SUMMARY = "Spam filtering system"
DESCRIPTION = "Rspamd is a spam filtering system that allows evaluation of messages \
by a number of rules including regular expressions, statistical analysis and \
custom services such as URL black lists. Each message is analysed by rspamd and \
given a 'spam score'. \
 \
According to this spam score and the user's settings, rspamd recommends an \
action for the MTA to apply to the message, for example to pass, reject or add \
a header.  Rspamd is designed to process hundreds of messages per second \
simultaneously and has a number of features available."
LICENSE = "Apache-2.0"

PV = "3.5"

RPM_NAME = "rspamd-3.5-1.2.aarch64.rpm"
RPM_HASH = "cb610e1442df157040ddd12d058d0aea356cd68ca7f8bf0717f2df2681ff407633f3637bd06fa7570c370adf917733b5519eee077928710c7bfab772e8bd285b"

RPROVIDES:${PN} += "config-rspamd \
librspamd-actrie.so \
librspamd-ev.so \
librspamd-kann.so \
librspamd-replxx.so \
librspamd-server.so \
rspamd"

RDEPENDS:${PN} += "/usr/bin/env \
/usr/bin/sh \
apparmor-abstractions \
ld-linux-aarch64.so.1 \
libc.so.6 \
libcrypto.so.3 \
libgcc-s.so.1 \
libglib-2.0.so.0 \
libicui18n.so.73 \
libicuuc.so.73 \
liblua5.4.so.5 \
libm.so.6 \
libopenblas.so.0 \
libpcre2-8.so.0 \
libsodium.so.23 \
libsqlite3.so.0 \
libssl.so.3 \
libstdc++.so.6 \
libunwind.so.8 \
libz.so.1 \
libzstd.so.1 \
lua54-lpeg \
shadow"

inherit rpm
