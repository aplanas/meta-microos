SUMMARY = "Utils for the Monero crypto-currency"
DESCRIPTION = "Monero is a private, secure, untraceable, decentralised digital currency. You are your bank, you control your funds, and nobody can trace your transfers unless you allow them to do so. \
Privacy: Monero uses a cryptographically sound system to allow you to send and receive funds without your transactions being easily revealed on the blockchain (the ledger of transactions that everyone has). This ensures that your purchases, receipts, and all transfers remain absolutely private by default. \
Security: Using the power of a distributed peer-to-peer consensus network, every transaction on the network is cryptographically secured. Individual wallets have a 24 word mnemonic seed that is only displayed once, and can be written down to backup the wallet. Wallet files are encrypted with a passphrase to ensure they are useless if stolen. \
Untraceability: By taking advantage of ring signatures, a special property of a certain type of cryptography, Monero is able to ensure that transactions are not only untraceable, but have an optional measure of ambiguity that ensures that transactions cannot easily be tied back to an individual user or computer. \
 \
This package provides Monero-CLI, a command line interface for Monero."
LICENSE = "MIT"

PV = "0.18.2.0"

RPM_NAME = "monero-utils-0.18.2.0-1.1.aarch64.rpm"
RPM_HASH = "224cc485f9279b3f46566e8f379eadabad4c2f139ea2380c2fcfd32f68cd87558979cd871189692a27c763e1744b84ad7a207e142843ecabc203172debf1be0c"

RPROVIDES:${PN} += "monero-utils \
monero-utils(aarch-64)"

RDEPENDS:${PN} += "ld-linux-aarch64.so.1()(64bit) \
libboost_chrono.so.1.81.0()(64bit) \
libboost_filesystem.so.1.81.0()(64bit) \
libboost_program_options.so.1.81.0()(64bit) \
libboost_serialization.so.1.81.0()(64bit) \
libboost_thread.so.1.81.0()(64bit) \
libc.so.6()(64bit) \
libcrypto.so.3()(64bit) \
libgcc_s.so.1()(64bit) \
libm.so.6()(64bit) \
libreadline.so.8()(64bit) \
libsodium.so.23()(64bit) \
libssl.so.3()(64bit) \
libstdc++.so.6()(64bit) \
libunbound.so.8()(64bit)"

inherit rpm
