SUMMARY = "Headless daemon for monero crypto-currency"
DESCRIPTION = "Monero is a private, secure, untraceable, decentralised digital currency. You are your bank, you control your funds, and nobody can trace your transfers unless you allow them to do so. \
Privacy: Monero uses a cryptographically sound system to allow you to send and receive funds without your transactions being easily revealed on the blockchain (the ledger of transactions that everyone has). This ensures that your purchases, receipts, and all transfers remain absolutely private by default. \
Security: Using the power of a distributed peer-to-peer consensus network, every transaction on the network is cryptographically secured. Individual wallets have a 24 word mnemonic seed that is only displayed once, and can be written down to backup the wallet. Wallet files are encrypted with a passphrase to ensure they are useless if stolen. \
Untraceability: By taking advantage of ring signatures, a special property of a certain type of cryptography, Monero is able to ensure that transactions are not only untraceable, but have an optional measure of ambiguity that ensures that transactions cannot easily be tied back to an individual user or computer. \
 \
This package provides monerod, a headless monero daemon."
LICENSE = "MIT"

PV = "0.18.2.0"

RPM_NAME = "monerod-0.18.2.0-1.1.aarch64.rpm"
RPM_HASH = "4337f90c37fa98947b50154f325344423e1c735489b3a17d227fff99c452625970c059928b3642467d448cc1e0fceb1936f86bcb64d43f557835e28265fff8af"

RPROVIDES:${PN} += "config-monerod \
monerod"

RDEPENDS:${PN} += "/bin/sh \
ld-linux-aarch64.so.1 \
libboost-chrono.so.1.81.0 \
libboost-filesystem.so.1.81.0 \
libboost-program-options.so.1.81.0 \
libboost-serialization.so.1.81.0 \
libboost-thread.so.1.81.0 \
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
