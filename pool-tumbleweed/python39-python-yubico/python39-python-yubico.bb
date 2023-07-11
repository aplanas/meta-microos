SUMMARY = "Python code for talking to Yubico's YubiKeys"
DESCRIPTION = "The YubiKey is a hardware token for authentication. The main mode of the YubiKey \
is entering a one time password (or a strong static password) by acting as a USB HID device, \
but there are things one can do with bi-directional communication: \
 \
 1. Configuration. The yubikey_config class should be a feature-wise complete implementation \
    of everything that can be configured on YubiKeys version 1.3 to 3.x (besides deprecated \
    functions in YubiKey 1.x). See examples/configure_nist_test_key for an example. \
 2. Challenge-response. YubiKey 2.2 and later supports HMAC-SHA1 or Yubico challenge-response \
    operations. See examples/nist_challenge_response for an example."
LICENSE = "BSD-2-Clause"

PV = "1.3.3"

RPM_NAME = "python39-python-yubico-1.3.3-2.10.noarch.rpm"
RPM_HASH = "86c54c301e87f43debfdc82ab705542a6e0d460dff5b84c30eeb2575a6880be9009b68d7d551b8795578f92bbb8c71b2187729756effd8aeb4c723a8f6142dc2"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "python3.9dist-python-yubico \
python39-python-yubico \
python39-yubico \
python3dist-python-yubico"

RDEPENDS:${PN} += "python-abi \
python39-usb"

inherit rpm
