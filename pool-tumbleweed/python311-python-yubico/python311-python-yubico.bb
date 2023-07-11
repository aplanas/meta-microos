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

RPM_NAME = "python311-python-yubico-1.3.3-2.10.noarch.rpm"
RPM_HASH = "821973959e902cf07ffc17b01a9cca99df5ca2c3c30079a9a8177f7e2db3603ec79b508a22d1f89e008227386e8c9478e31e1fb44d83e847f8af33ecb903babb"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "python3-python-yubico \
python3-yubico \
python3.11dist-python-yubico \
python311-python-yubico \
python311-yubico \
python3dist-python-yubico"

RDEPENDS:${PN} += "python-abi \
python311-usb"

inherit rpm
