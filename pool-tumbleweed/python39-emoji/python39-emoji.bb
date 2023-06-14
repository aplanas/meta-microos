SUMMARY = "Emoji for Python"
DESCRIPTION = "This Python module provides unicode emoji output for strings containing emoji codes. \
In addition to the official list defined by the unicode consortium a whole bunch of aliases is defined. \
 \
Example: \
>> import emoji \
>> print(emoji.emojize('Python is :thumbs_up:')) \
Python is 👍 \
>> print(emoji.emojize('Python is :thumbsup:', use_aliases=True)) \
Python is 👍 \
 \
By default, the language is English (``language='en'``) several further languages are also supported."
LICENSE = "BSD-3-Clause"

PV = "2.4.0"

RPM_NAME = "python39-emoji-2.4.0-1.1.noarch.rpm"
RPM_HASH = "6e646885456c28506b70cfabc1dabcd1c85ad8bcdafbd2674a6e367601dc4644fc3109c68bfe200f73d6ca2f61c5631b8442b6b6a0a8f0f9c82623e78b0e859d"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "python3.9dist-emoji \
python39-emoji \
python3dist-emoji"

RDEPENDS:${PN} += "python-abi"

inherit rpm
