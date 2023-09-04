SUMMARY = "Development files for monero"
DESCRIPTION = "Monero is a private, secure, untraceable, decentralised digital currency. You are your bank, you control your funds, and nobody can trace your transfers unless you allow them to do so. \
Privacy: Monero uses a cryptographically sound system to allow you to send and receive funds without your transactions being easily revealed on the blockchain (the ledger of transactions that everyone has). This ensures that your purchases, receipts, and all transfers remain absolutely private by default. \
Security: Using the power of a distributed peer-to-peer consensus network, every transaction on the network is cryptographically secured. Individual wallets have a 24 word mnemonic seed that is only displayed once, and can be written down to backup the wallet. Wallet files are encrypted with a passphrase to ensure they are useless if stolen. \
Untraceability: By taking advantage of ring signatures, a special property of a certain type of cryptography, Monero is able to ensure that transactions are not only untraceable, but have an optional measure of ambiguity that ensures that transactions cannot easily be tied back to an individual user or computer. \
 \
The monero-devel package contains libraries and header files for developing applications that use monero."
LICENSE = "MIT"

PV = "0.18.2.2"

RPM_NAME = "monero-devel-0.18.2.2-1.1.aarch64.rpm"
RPM_HASH = "a470e30eb8095f7855fb0e912facccfe29c289be1f123ba955e0b692984a21c423fb3430c3cb0e92bd3bfdd2a679f66a5290add7838065b8733e7c04a19d614b"

RPROVIDES:${PN} += "monero-devel"

RDEPENDS:${PN} += ""

inherit rpm
