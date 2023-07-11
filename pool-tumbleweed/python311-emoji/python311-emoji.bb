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

PV = "2.6.0"

RPM_NAME = "python311-emoji-2.6.0-1.1.noarch.rpm"
RPM_HASH = "c37a225dc4fdc56c3fa5f661ece36119a9410205bc7f5827708c78c1b1b10e76a6abda58b19d94043c5fef6a55e6f8c84b661a02ab989c5d94f9404338463456"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "python3-emoji \
python3.11dist-emoji \
python311-emoji \
python3dist-emoji"

RDEPENDS:${PN} += "python-abi"

inherit rpm
