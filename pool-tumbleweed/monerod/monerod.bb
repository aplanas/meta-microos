SUMMARY = "Headless daemon for monero crypto-currency"
DESCRIPTION = "Monero is a private, secure, untraceable, decentralised digital currency. You are your bank, you control your funds, and nobody can trace your transfers unless you allow them to do so. \
Privacy: Monero uses a cryptographically sound system to allow you to send and receive funds without your transactions being easily revealed on the blockchain (the ledger of transactions that everyone has). This ensures that your purchases, receipts, and all transfers remain absolutely private by default. \
Security: Using the power of a distributed peer-to-peer consensus network, every transaction on the network is cryptographically secured. Individual wallets have a 24 word mnemonic seed that is only displayed once, and can be written down to backup the wallet. Wallet files are encrypted with a passphrase to ensure they are useless if stolen. \
Untraceability: By taking advantage of ring signatures, a special property of a certain type of cryptography, Monero is able to ensure that transactions are not only untraceable, but have an optional measure of ambiguity that ensures that transactions cannot easily be tied back to an individual user or computer. \
 \
This package provides monerod, a headless monero daemon."
LICENSE = "MIT"

PV = "0.18.2.2"

RPM_NAME = "monerod-0.18.2.2-1.1.aarch64.rpm"
RPM_HASH = "81e34316067b1b816d871cb809f22ec9bfdff0a9c92ad9bfb392390c5866b6f5cbf72f0eee6baf03b24fe28fb9ae19fb6eafaeac11bf4ca21325e9b07aa63b2d"

RPROVIDES:${PN} += "config-monerod \
monerod"

RDEPENDS:${PN} += "/usr/bin/sh \
ld-linux-aarch64.so.1 \
libboost-chrono.so.1.82.0 \
libboost-filesystem.so.1.82.0 \
libboost-program-options.so.1.82.0 \
libboost-serialization.so.1.82.0 \
libboost-thread.so.1.82.0 \
libc.so.6 \
libcrypto.so.3 \
libgcc-s.so.1 \
libm.so.6 \
libreadline.so.8 \
libsodium.so.23 \
libssl.so.3 \
libstdc++.so.6 \
libunbound.so.8 \
libzmq.so.5"

inherit rpm
