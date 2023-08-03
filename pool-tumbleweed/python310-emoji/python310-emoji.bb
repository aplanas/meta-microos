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
By default, the language is English (``language='en'``). Further supported langauges are: \
* Spanish ('es') \
* Portuguese ('pt') \
* Italian ('it') \
* French ('fr') \
* German ('de') \
* Farsi/Persian ('fa') \
* Indonesian ('id') \
* Simplified Chinese ('zh') \
* Japanese ('ja') \
* Korean ('ko')"
LICENSE = "BSD-3-Clause"

PV = "2.7.0"

RPM_NAME = "python310-emoji-2.7.0-1.1.noarch.rpm"
RPM_HASH = "26d863063bb94c92d2e92192292fed8638d53cc122b04a5c1f31a7aaeb1bc846d2f7cfbd1f906418ba805269982f3756fbf0ee376fe37cb3b1c5bba0dc1bb580"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "python3.10dist-emoji \
python310-emoji \
python3dist-emoji"

RDEPENDS:${PN} += "python-abi"

inherit rpm
